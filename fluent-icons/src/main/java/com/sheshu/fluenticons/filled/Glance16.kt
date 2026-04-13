package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Glance16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Glance16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 12.25f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-2.5f)
            curveTo(8.784f, 14f, 8f, 13.216f, 8f, 12.25f)
            verticalLineToRelative(-3.5f)
            curveTo(8f, 7.784f, 8.784f, 7f, 9.75f, 7f)
            horizontalLineToRelative(2.5f)
            curveTo(13.216f, 7f, 14f, 7.784f, 14f, 8.75f)
            verticalLineToRelative(3.5f)
            close()
            moveToRelative(-7f, -5f)
            curveTo(7f, 8.216f, 6.216f, 9f, 5.25f, 9f)
            horizontalLineToRelative(-1.5f)
            curveTo(2.784f, 9f, 2f, 8.216f, 2f, 7.25f)
            verticalLineToRelative(-3.5f)
            curveTo(2f, 2.784f, 2.784f, 2f, 3.75f, 2f)
            horizontalLineToRelative(1.5f)
            curveTo(6.216f, 2f, 7f, 2.784f, 7f, 3.75f)
            verticalLineToRelative(3.5f)
            close()
            moveToRelative(0f, 5f)
            curveTo(7f, 13.216f, 6.216f, 14f, 5.25f, 14f)
            horizontalLineToRelative(-1.5f)
            curveTo(2.784f, 14f, 2f, 13.216f, 2f, 12.25f)
            verticalLineToRelative(-0.5f)
            curveTo(2f, 10.784f, 2.784f, 10f, 3.75f, 10f)
            horizontalLineToRelative(1.5f)
            curveTo(6.216f, 10f, 7f, 10.784f, 7f, 11.75f)
            verticalLineToRelative(0.5f)
            close()
            moveToRelative(7f, -8f)
            curveTo(14f, 5.216f, 13.216f, 6f, 12.25f, 6f)
            horizontalLineToRelative(-2.5f)
            curveTo(8.784f, 6f, 8f, 5.216f, 8f, 4.25f)
            verticalLineToRelative(-0.5f)
            curveTo(8f, 2.784f, 8.784f, 2f, 9.75f, 2f)
            horizontalLineToRelative(2.5f)
            curveTo(13.216f, 2f, 14f, 2.784f, 14f, 3.75f)
            verticalLineToRelative(0.5f)
            close()
        }
    }.build()
}
