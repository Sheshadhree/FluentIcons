package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Key16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Key16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 12f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(1f)
            curveTo(8.776f, 11.5f, 9f, 11.276f, 9f, 11f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(1f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            curveToRelative(0f, 0.392f, 0.057f, 0.772f, 0.162f, 1.13f)
            lineTo(2.292f, 11f)
            curveTo(2.106f, 11.188f, 2f, 11.442f, 2f, 11.707f)
            verticalLineTo(13f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            close()
            moveTo(7f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 9f, 8f, 9.224f, 8f, 9.5f)
            verticalLineToRelative(1f)
            horizontalLineTo(7f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-1f)
            curveTo(5.224f, 11.5f, 5f, 11.724f, 5f, 12f)
            verticalLineToRelative(1f)
            horizontalLineTo(3f)
            verticalLineToRelative(-1.293f)
            lineToRelative(4.089f, -4.089f)
            curveToRelative(0.14f, -0.14f, 0.184f, -0.35f, 0.113f, -0.534f)
            curveTo(7.072f, 6.748f, 7f, 6.384f, 7f, 6f)
            close()
        }
    }.build()
}
