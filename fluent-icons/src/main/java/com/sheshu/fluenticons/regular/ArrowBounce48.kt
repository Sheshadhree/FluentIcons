package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowBounce48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowBounce48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 14.25f)
            curveTo(4f, 13.56f, 4.56f, 13f, 5.25f, 13f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(8.295f)
            lineToRelative(16.706f, 16.494f)
            lineTo(41.872f, 15.36f)
            curveToRelative(0.492f, -0.485f, 1.283f, -0.48f, 1.768f, 0.012f)
            curveToRelative(0.485f, 0.492f, 0.48f, 1.283f, -0.012f, 1.768f)
            lineToRelative(-17.75f, 17.5f)
            curveToRelative(-0.487f, 0.48f, -1.27f, 0.48f, -1.756f, 0f)
            lineTo(6.5f, 17.24f)
            verticalLineToRelative(12.577f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(4f, 30.507f, 4f, 29.817f)
            verticalLineTo(14.25f)
            close()
        }
    }.build()
}
