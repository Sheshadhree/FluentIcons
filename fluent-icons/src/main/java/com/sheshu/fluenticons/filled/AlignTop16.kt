package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignTop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignTop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 2f)
            curveTo(1.224f, 2f, 1f, 2.224f, 1f, 2.5f)
            reflectiveCurveTo(1.224f, 3f, 1.5f, 3f)
            horizontalLineToRelative(13f)
            curveTo(14.776f, 3f, 15f, 2.776f, 15f, 2.5f)
            reflectiveCurveTo(14.776f, 2f, 14.5f, 2f)
            horizontalLineToRelative(-13f)
            close()
            moveTo(2f, 5.75f)
            curveTo(2f, 4.784f, 2.784f, 4f, 3.75f, 4f)
            horizontalLineToRelative(1.5f)
            curveTo(6.216f, 4f, 7f, 4.784f, 7f, 5.75f)
            verticalLineToRelative(6.5f)
            curveTo(7f, 13.216f, 6.216f, 14f, 5.25f, 14f)
            horizontalLineToRelative(-1.5f)
            curveTo(2.784f, 14f, 2f, 13.216f, 2f, 12.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveToRelative(7f, 0f)
            curveTo(9f, 4.784f, 9.784f, 4f, 10.75f, 4f)
            horizontalLineToRelative(1.5f)
            curveTo(13.216f, 4f, 14f, 4.784f, 14f, 5.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-1.5f)
            curveTo(9.784f, 12f, 9f, 11.216f, 9f, 10.25f)
            verticalLineToRelative(-4.5f)
            close()
        }
    }.build()
}
