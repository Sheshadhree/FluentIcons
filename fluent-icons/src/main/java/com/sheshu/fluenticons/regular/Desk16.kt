package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Desk16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Desk16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 3f)
            curveTo(1.784f, 3f, 1f, 3.784f, 1f, 4.75f)
            verticalLineToRelative(6.5f)
            curveTo(1f, 12.216f, 1.784f, 13f, 2.75f, 13f)
            horizontalLineToRelative(3.5f)
            curveTo(7.216f, 13f, 8f, 12.216f, 8f, 11.25f)
            verticalLineTo(7f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(4.75f)
            curveTo(15f, 3.784f, 14.216f, 3f, 13.25f, 3f)
            horizontalLineTo(2.75f)
            close()
            moveTo(2f, 7f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(4.25f)
            curveTo(7f, 11.664f, 6.664f, 12f, 6.25f, 12f)
            horizontalLineToRelative(-3.5f)
            curveTo(2.336f, 12f, 2f, 11.664f, 2f, 11.25f)
            verticalLineTo(7f)
            close()
            moveToRelative(0f, -1f)
            verticalLineTo(4.75f)
            curveTo(2f, 4.336f, 2.336f, 4f, 2.75f, 4f)
            horizontalLineToRelative(10.5f)
            curveTo(13.664f, 4f, 14f, 4.336f, 14f, 4.75f)
            verticalLineTo(6f)
            horizontalLineTo(2f)
            close()
            moveToRelative(1.5f, 2f)
            curveTo(3.224f, 8f, 3f, 8.224f, 3f, 8.5f)
            reflectiveCurveTo(3.224f, 9f, 3.5f, 9f)
            horizontalLineToRelative(2f)
            curveTo(5.776f, 9f, 6f, 8.776f, 6f, 8.5f)
            reflectiveCurveTo(5.776f, 8f, 5.5f, 8f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}
