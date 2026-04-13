package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.GlanceHorizontal16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GlanceHorizontal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 2f)
            curveTo(2.784f, 2f, 2f, 2.784f, 2f, 3.75f)
            verticalLineToRelative(2.5f)
            curveTo(2f, 7.216f, 2.784f, 8f, 3.75f, 8f)
            horizontalLineToRelative(3.5f)
            curveTo(8.216f, 8f, 9f, 7.216f, 9f, 6.25f)
            verticalLineToRelative(-2.5f)
            curveTo(9f, 2.784f, 8.216f, 2f, 7.25f, 2f)
            horizontalLineToRelative(-3.5f)
            close()
            moveToRelative(5f, 7f)
            curveTo(7.784f, 9f, 7f, 9.784f, 7f, 10.75f)
            verticalLineToRelative(1.5f)
            curveTo(7f, 13.216f, 7.784f, 14f, 8.75f, 14f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-1.5f)
            curveTo(14f, 9.784f, 13.216f, 9f, 12.25f, 9f)
            horizontalLineToRelative(-3.5f)
            close()
            moveToRelative(-5f, 0f)
            curveTo(2.784f, 9f, 2f, 9.784f, 2f, 10.75f)
            verticalLineToRelative(1.5f)
            curveTo(2f, 13.216f, 2.784f, 14f, 3.75f, 14f)
            horizontalLineToRelative(0.5f)
            curveTo(5.216f, 14f, 6f, 13.216f, 6f, 12.25f)
            verticalLineToRelative(-1.5f)
            curveTo(6f, 9.784f, 5.216f, 9f, 4.25f, 9f)
            horizontalLineToRelative(-0.5f)
            close()
            moveToRelative(8f, -7f)
            curveTo(10.784f, 2f, 10f, 2.784f, 10f, 3.75f)
            verticalLineToRelative(2.5f)
            curveTo(10f, 7.216f, 10.784f, 8f, 11.75f, 8f)
            horizontalLineToRelative(0.5f)
            curveTo(13.216f, 8f, 14f, 7.216f, 14f, 6.25f)
            verticalLineToRelative(-2.5f)
            curveTo(14f, 2.784f, 13.216f, 2f, 12.25f, 2f)
            horizontalLineToRelative(-0.5f)
            close()
        }
    }.build()
}
