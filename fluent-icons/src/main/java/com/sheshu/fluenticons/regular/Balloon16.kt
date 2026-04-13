package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Balloon16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Balloon16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 3.5f)
            curveTo(7.5f, 3.224f, 7.724f, 3f, 8f, 3f)
            curveToRelative(0.663f, 0f, 1.283f, 0.326f, 1.729f, 0.772f)
            curveTo(10.174f, 4.216f, 10.5f, 4.837f, 10.5f, 5.5f)
            curveTo(10.5f, 5.776f, 10.276f, 6f, 10f, 6f)
            reflectiveCurveTo(9.5f, 5.776f, 9.5f, 5.5f)
            curveToRelative(0f, -0.337f, -0.174f, -0.717f, -0.479f, -1.021f)
            curveTo(8.717f, 4.174f, 8.338f, 4f, 8f, 4f)
            curveTo(7.724f, 4f, 7.5f, 3.776f, 7.5f, 3.5f)
            close()
            moveToRelative(1f, 7.458f)
            curveToRelative(1.016f, -0.172f, 1.949f, -0.847f, 2.64f, -1.714f)
            curveTo(11.953f, 8.228f, 12.5f, 6.87f, 12.5f, 5.5f)
            curveTo(12.5f, 3.266f, 10.816f, 1f, 8f, 1f)
            reflectiveCurveTo(3.5f, 3.266f, 3.5f, 5.5f)
            curveToRelative(0f, 1.37f, 0.548f, 2.728f, 1.36f, 3.744f)
            curveToRelative(0.691f, 0.867f, 1.624f, 1.542f, 2.64f, 1.714f)
            verticalLineTo(11f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineTo(11f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(14f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(9.5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-0.042f)
            close()
            moveTo(8f, 2f)
            curveToRelative(2.184f, 0f, 3.5f, 1.734f, 3.5f, 3.5f)
            curveToRelative(0f, 1.115f, -0.452f, 2.257f, -1.14f, 3.12f)
            curveTo(9.662f, 9.492f, 8.792f, 10f, 8f, 10f)
            curveToRelative(-0.793f, 0f, -1.663f, -0.508f, -2.36f, -1.38f)
            curveTo(4.953f, 7.757f, 4.5f, 6.615f, 4.5f, 5.5f)
            curveTo(4.5f, 3.734f, 5.816f, 2f, 8f, 2f)
            close()
        }
    }.build()
}
