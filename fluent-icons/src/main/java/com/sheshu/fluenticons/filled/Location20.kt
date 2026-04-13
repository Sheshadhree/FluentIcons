package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Location20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Location20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.05f, 4.05f)
            curveToRelative(2.734f, -2.733f, 7.166f, -2.734f, 9.9f, 0f)
            curveToRelative(2.733f, 2.736f, 2.733f, 7.17f, 0f, 9.905f)
            lineToRelative(-1.128f, 1.114f)
            lineToRelative(-2.435f, 2.37f)
            curveToRelative(-0.73f, 0.707f, -1.865f, 0.745f, -2.64f, 0.118f)
            lineToRelative(-0.133f, -0.118f)
            lineToRelative(-2.043f, -1.985f)
            lineToRelative(-1.52f, -1.499f)
            curveToRelative(-2.734f, -2.735f, -2.734f, -7.17f, 0f, -9.904f)
            close()
            moveTo(10f, 6.5f)
            curveTo(8.62f, 6.5f, 7.5f, 7.62f, 7.5f, 9f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            close()
        }
    }.build()
}
