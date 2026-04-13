package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Desk16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Desk16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 3f)
            curveTo(1.784f, 3f, 1f, 3.784f, 1f, 4.75f)
            verticalLineTo(6f)
            horizontalLineToRelative(13f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(4.75f)
            curveTo(15f, 3.784f, 14.216f, 3f, 13.25f, 3f)
            horizontalLineTo(2.75f)
            close()
            moveTo(8f, 7f)
            horizontalLineTo(1f)
            verticalLineToRelative(4.25f)
            curveTo(1f, 12.216f, 1.784f, 13f, 2.75f, 13f)
            horizontalLineToRelative(3.5f)
            curveTo(7.216f, 13f, 8f, 12.216f, 8f, 11.25f)
            verticalLineTo(7f)
            close()
            moveTo(3f, 9f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2f)
            curveTo(5.776f, 8.5f, 6f, 8.724f, 6f, 9f)
            reflectiveCurveTo(5.776f, 9.5f, 5.5f, 9.5f)
            horizontalLineToRelative(-2f)
            curveTo(3.224f, 9.5f, 3f, 9.276f, 3f, 9f)
            close()
        }
    }.build()
}
