package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Seat16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Seat16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7.75f)
            curveTo(2f, 13.216f, 2.784f, 14f, 3.75f, 14f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(13f, 7.5f)
            curveTo(12.582f, 7.186f, 12.063f, 7f, 11.5f, 7f)
            curveToRelative(-0.744f, 0f, -1.412f, 0.325f, -1.87f, 0.84f)
            curveTo(9.267f, 7.333f, 8.672f, 7f, 8f, 7f)
            curveTo(7.327f, 7f, 6.733f, 7.332f, 6.37f, 7.84f)
            curveTo(5.912f, 7.326f, 5.244f, 7f, 4.5f, 7f)
            curveTo(3.937f, 7f, 3.418f, 7.186f, 3f, 7.5f)
            verticalLineToRelative(-3f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(-3f, 2f)
            curveTo(10f, 8.672f, 10.672f, 8f, 11.5f, 8f)
            reflectiveCurveTo(13f, 8.672f, 13f, 9.5f)
            verticalLineToRelative(2.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(10f)
            verticalLineTo(9.5f)
            close()
            moveTo(9f, 9f)
            verticalLineToRelative(4f)
            horizontalLineTo(7f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(-5.25f, 4f)
            curveTo(3.336f, 13f, 3f, 12.664f, 3f, 12.25f)
            verticalLineTo(9.5f)
            curveTo(3f, 8.672f, 3.672f, 8f, 4.5f, 8f)
            reflectiveCurveTo(6f, 8.672f, 6f, 9.5f)
            verticalLineTo(13f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}
