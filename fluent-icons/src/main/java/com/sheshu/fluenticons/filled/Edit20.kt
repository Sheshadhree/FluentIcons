package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Edit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Edit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.92f, 2.873f)
            curveToRelative(1.183f, -1.182f, 3.107f, -1.158f, 4.26f, 0.054f)
            curveToRelative(1.111f, 1.17f, 1.088f, 3.012f, -0.053f, 4.153f)
            lineToRelative(-0.669f, 0.669f)
            lineToRelative(-4.207f, -4.207f)
            lineToRelative(0.67f, -0.669f)
            close()
            moveTo(11.544f, 4.25f)
            lineToRelative(-7.999f, 7.999f)
            curveTo(3.218f, 12.575f, 2.99f, 12.99f, 2.89f, 13.442f)
            lineToRelative(-0.878f, 3.95f)
            curveToRelative(-0.037f, 0.167f, 0.014f, 0.341f, 0.135f, 0.462f)
            curveToRelative(0.12f, 0.121f, 0.295f, 0.172f, 0.462f, 0.135f)
            lineToRelative(3.926f, -0.873f)
            curveToRelative(0.467f, -0.104f, 0.896f, -0.34f, 1.234f, -0.678f)
            lineToRelative(7.982f, -7.982f)
            lineToRelative(-4.207f, -4.207f)
            close()
        }
    }.build()
}
