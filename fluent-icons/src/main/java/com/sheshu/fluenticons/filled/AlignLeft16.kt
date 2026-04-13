package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 1.5f)
            curveTo(2f, 1.224f, 2.224f, 1f, 2.5f, 1f)
            reflectiveCurveTo(3f, 1.224f, 3f, 1.5f)
            verticalLineToRelative(13f)
            curveTo(3f, 14.776f, 2.776f, 15f, 2.5f, 15f)
            reflectiveCurveTo(2f, 14.776f, 2f, 14.5f)
            verticalLineToRelative(-13f)
            close()
            moveTo(5.75f, 2f)
            curveTo(4.784f, 2f, 4f, 2.784f, 4f, 3.75f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 6.216f, 4.784f, 7f, 5.75f, 7f)
            horizontalLineToRelative(6.5f)
            curveTo(13.216f, 7f, 14f, 6.216f, 14f, 5.25f)
            verticalLineToRelative(-1.5f)
            curveTo(14f, 2.784f, 13.216f, 2f, 12.25f, 2f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(0f, 7f)
            curveTo(4.784f, 9f, 4f, 9.784f, 4f, 10.75f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 13.216f, 4.784f, 14f, 5.75f, 14f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-1.5f)
            curveTo(12f, 9.784f, 11.216f, 9f, 10.25f, 9f)
            horizontalLineToRelative(-4.5f)
            close()
        }
    }.build()
}
