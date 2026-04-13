package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BinderTriangle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BinderTriangle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 1f)
            curveTo(2.784f, 1f, 2f, 1.784f, 2f, 2.75f)
            verticalLineTo(3f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 3f, 1f, 3.224f, 1f, 3.5f)
            reflectiveCurveTo(1.224f, 4f, 1.5f, 4f)
            horizontalLineTo(2f)
            verticalLineToRelative(2f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 6f, 1f, 6.224f, 1f, 6.5f)
            reflectiveCurveTo(1.224f, 7f, 1.5f, 7f)
            horizontalLineTo(2f)
            verticalLineToRelative(2f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 9f, 1f, 9.224f, 1f, 9.5f)
            reflectiveCurveTo(1.224f, 10f, 1.5f, 10f)
            horizontalLineTo(2f)
            verticalLineToRelative(0.25f)
            curveTo(2f, 11.216f, 2.784f, 12f, 3.75f, 12f)
            horizontalLineToRelative(0.857f)
            lineTo(11f, 4.187f)
            verticalLineTo(2.75f)
            curveTo(11f, 1.784f, 10.216f, 1f, 9.25f, 1f)
            horizontalLineToRelative(-5.5f)
            close()
            moveTo(5.5f, 4f)
            horizontalLineToRelative(2f)
            curveTo(7.776f, 4f, 8f, 4.224f, 8f, 4.5f)
            reflectiveCurveTo(7.776f, 5f, 7.5f, 5f)
            horizontalLineToRelative(-2f)
            curveTo(5.224f, 5f, 5f, 4.776f, 5f, 4.5f)
            reflectiveCurveTo(5.224f, 4f, 5.5f, 4f)
            close()
            moveTo(14f, 3.5f)
            curveToRelative(0f, -0.211f, -0.133f, -0.4f, -0.332f, -0.47f)
            curveToRelative(-0.199f, -0.072f, -0.421f, -0.01f, -0.555f, 0.153f)
            lineToRelative(-9f, 11f)
            curveToRelative(-0.122f, 0.15f, -0.148f, 0.357f, -0.065f, 0.531f)
            curveTo(4.131f, 14.89f, 4.307f, 15f, 4.5f, 15f)
            horizontalLineToRelative(7.75f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(3.5f)
            close()
            moveToRelative(-2.95f, 5.6f)
            curveToRelative(0.144f, -0.192f, 0.45f, -0.09f, 0.45f, 0.15f)
            verticalLineTo(12f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(9f)
            curveToRelative(-0.206f, 0f, -0.324f, -0.235f, -0.2f, -0.4f)
            lineToRelative(2.25f, -3f)
            close()
        }
    }.build()
}
