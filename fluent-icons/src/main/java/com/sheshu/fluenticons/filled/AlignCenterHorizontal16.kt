package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignCenterHorizontal16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignCenterHorizontal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 7.5f)
            curveTo(15f, 7.776f, 14.776f, 8f, 14.5f, 8f)
            horizontalLineTo(14f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-1.5f)
            curveTo(9.784f, 11f, 9f, 10.216f, 9f, 9.25f)
            verticalLineTo(8f)
            horizontalLineTo(7f)
            verticalLineToRelative(2.25f)
            curveTo(7f, 11.216f, 6.216f, 12f, 5.25f, 12f)
            horizontalLineToRelative(-1.5f)
            curveTo(2.784f, 12f, 2f, 11.216f, 2f, 10.25f)
            verticalLineTo(8f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 8f, 1f, 7.776f, 1f, 7.5f)
            reflectiveCurveTo(1.224f, 7f, 1.5f, 7f)
            horizontalLineTo(2f)
            verticalLineTo(4.75f)
            curveTo(2f, 3.784f, 2.784f, 3f, 3.75f, 3f)
            horizontalLineToRelative(1.5f)
            curveTo(6.216f, 3f, 7f, 3.784f, 7f, 4.75f)
            verticalLineTo(7f)
            horizontalLineToRelative(2f)
            verticalLineTo(5.75f)
            curveTo(9f, 4.784f, 9.784f, 4f, 10.75f, 4f)
            horizontalLineToRelative(1.5f)
            curveTo(13.216f, 4f, 14f, 4.784f, 14f, 5.75f)
            verticalLineTo(7f)
            horizontalLineToRelative(0.5f)
            curveTo(14.776f, 7f, 15f, 7.224f, 15f, 7.5f)
            close()
        }
    }.build()
}
