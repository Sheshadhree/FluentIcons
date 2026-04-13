package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pen20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pen20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.92f, 2.873f)
            curveToRelative(1.183f, -1.182f, 3.107f, -1.158f, 4.26f, 0.054f)
            curveToRelative(1.111f, 1.17f, 1.088f, 3.012f, -0.053f, 4.153f)
            lineToRelative(-0.67f, 0.67f)
            lineToRelative(0.336f, 0.336f)
            curveToRelative(0.78f, 0.78f, 0.78f, 2.047f, 0f, 2.828f)
            lineToRelative(-0.94f, 0.94f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(0.94f, -0.939f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineTo(15.75f, 8.457f)
            lineToRelative(-7.98f, 7.981f)
            curveToRelative(-0.34f, 0.339f, -0.768f, 0.574f, -1.235f, 0.678f)
            lineToRelative(-3.926f, 0.873f)
            curveToRelative(-0.167f, 0.037f, -0.342f, -0.014f, -0.462f, -0.135f)
            curveToRelative(-0.121f, -0.12f, -0.172f, -0.295f, -0.135f, -0.462f)
            lineToRelative(0.877f, -3.95f)
            curveToRelative(0.101f, -0.452f, 0.329f, -0.867f, 0.656f, -1.194f)
            lineToRelative(9.375f, -9.375f)
            close()
        }
    }.build()
}
