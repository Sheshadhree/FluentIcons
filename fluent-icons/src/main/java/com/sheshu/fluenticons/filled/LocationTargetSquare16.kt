package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationTargetSquare16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationTargetSquare16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(6f, 8f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            close()
            moveTo(5.042f, 7.5f)
            curveTo(5.252f, 6.244f, 6.244f, 5.252f, 7.5f, 5.042f)
            verticalLineTo(4.5f)
            curveTo(7.5f, 4.224f, 7.724f, 4f, 8f, 4f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(0.542f)
            curveToRelative(1.256f, 0.21f, 2.248f, 1.202f, 2.459f, 2.458f)
            horizontalLineTo(11.5f)
            curveTo(11.776f, 7.5f, 12f, 7.724f, 12f, 8f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-0.541f)
            curveToRelative(-0.211f, 1.256f, -1.203f, 2.248f, -2.459f, 2.459f)
            verticalLineTo(11.5f)
            curveTo(8.5f, 11.776f, 8.276f, 12f, 8f, 12f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-0.541f)
            curveTo(6.244f, 10.748f, 5.252f, 9.756f, 5.042f, 8.5f)
            horizontalLineTo(4.5f)
            curveTo(4.224f, 8.5f, 4f, 8.276f, 4f, 8f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(0.542f)
            close()
            moveTo(9f, 8f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(7f, 7.448f, 7f, 8f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            close()
        }
    }.build()
}
