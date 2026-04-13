package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Triangle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Triangle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.302f, 16.63f)
            curveTo(1.442f, 18.13f, 2.524f, 20f, 4.253f, 20f)
            horizontalLineToRelative(15.49f)
            curveToRelative(1.729f, 0f, 2.812f, -1.87f, 1.951f, -3.37f)
            lineTo(13.95f, 3.129f)
            curveToRelative(-0.865f, -1.507f, -3.04f, -1.507f, -3.904f, 0f)
            lineTo(2.302f, 16.631f)
            close()
            moveToRelative(1.951f, 1.87f)
            curveToRelative(-0.576f, 0f, -0.937f, -0.623f, -0.65f, -1.123f)
            lineToRelative(7.744f, -13.502f)
            curveToRelative(0.289f, -0.503f, 1.013f, -0.503f, 1.301f, 0f)
            lineToRelative(7.745f, 13.502f)
            curveToRelative(0.287f, 0.5f, -0.074f, 1.123f, -0.65f, 1.123f)
            horizontalLineTo(4.252f)
            close()
        }
    }.build()
}
