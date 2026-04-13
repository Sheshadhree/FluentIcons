package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RotateRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RotateRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 15f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(9.914f, 13.5f, 9.5f, 13.5f)
            horizontalLineTo(9f)
            curveToRelative(-2.485f, 0f, -4.5f, -1.567f, -4.5f, -3.5f)
            curveToRelative(0f, -1.874f, 1.894f, -3.405f, 4.275f, -3.496f)
            lineTo(9f, 6.5f)
            horizontalLineToRelative(6.939f)
            lineToRelative(-1.72f, 1.72f)
            curveToRelative(-0.292f, 0.293f, -0.292f, 0.767f, 0f, 1.06f)
            curveToRelative(0.267f, 0.267f, 0.684f, 0.29f, 0.977f, 0.073f)
            lineTo(15.28f, 9.28f)
            lineToRelative(3f, -3f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-3f, -3f)
            lineToRelative(-0.084f, -0.073f)
            curveToRelative(-0.293f, -0.218f, -0.71f, -0.194f, -0.976f, 0.073f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineTo(15.938f, 5f)
            horizontalLineTo(9f)
            curveToRelative(-3.314f, 0f, -6f, 2.239f, -6f, 5f)
            reflectiveCurveToRelative(2.686f, 5f, 6f, 5f)
            horizontalLineToRelative(0.5f)
            close()
            moveToRelative(11f, -4.633f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(20f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3.861f)
            curveToRelative(-0.178f, 0f, -0.343f, -0.095f, -0.432f, -0.25f)
            curveToRelative(-0.138f, -0.238f, -0.057f, -0.544f, 0.182f, -0.683f)
            lineToRelative(16.638f, -9.633f)
            curveToRelative(0.077f, -0.044f, 0.163f, -0.067f, 0.251f, -0.067f)
            close()
        }
    }.build()
}
