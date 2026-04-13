package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RotateLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RotateLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 15f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineTo(15f)
            curveToRelative(2.485f, 0f, 4.5f, -1.567f, 4.5f, -3.5f)
            curveToRelative(0f, -1.874f, -1.895f, -3.405f, -4.275f, -3.496f)
            lineTo(15f, 6.5f)
            horizontalLineTo(8.061f)
            lineToRelative(1.72f, 1.72f)
            curveToRelative(0.292f, 0.293f, 0.292f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.267f, 0.267f, -0.684f, 0.29f, -0.977f, 0.073f)
            lineTo(8.72f, 9.28f)
            lineToRelative(-3f, -3f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(3f, -3f)
            lineToRelative(0.084f, -0.073f)
            curveTo(9.097f, 1.929f, 9.514f, 1.953f, 9.78f, 2.22f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(8.062f, 5f)
            horizontalLineTo(15f)
            curveToRelative(3.314f, 0f, 6f, 2.239f, 6f, 5f)
            reflectiveCurveToRelative(-2.686f, 5f, -6f, 5f)
            horizontalLineToRelative(-0.5f)
            close()
            moveToRelative(-11f, -4.633f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineTo(20f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(16.138f)
            curveToRelative(0.179f, 0f, 0.344f, -0.095f, 0.433f, -0.25f)
            curveToRelative(0.138f, -0.238f, 0.057f, -0.544f, -0.182f, -0.683f)
            lineTo(3.75f, 10.434f)
            curveToRelative(-0.076f, -0.044f, -0.162f, -0.067f, -0.25f, -0.067f)
            close()
        }
    }.build()
}
