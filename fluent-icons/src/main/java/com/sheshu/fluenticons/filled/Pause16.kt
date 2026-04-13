package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pause16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pause16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 2f)
            curveTo(2.784f, 2f, 2f, 2.784f, 2f, 3.75f)
            verticalLineToRelative(8.5f)
            curveTo(2f, 13.216f, 2.784f, 14f, 3.75f, 14f)
            horizontalLineToRelative(1.5f)
            curveTo(6.216f, 14f, 7f, 13.216f, 7f, 12.25f)
            verticalLineToRelative(-8.5f)
            curveTo(7f, 2.784f, 6.216f, 2f, 5.25f, 2f)
            horizontalLineToRelative(-1.5f)
            close()
            moveToRelative(7f, 0f)
            curveTo(9.784f, 2f, 9f, 2.784f, 9f, 3.75f)
            verticalLineToRelative(8.5f)
            curveTo(9f, 13.216f, 9.784f, 14f, 10.75f, 14f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-8.5f)
            curveTo(14f, 2.784f, 13.216f, 2f, 12.25f, 2f)
            horizontalLineToRelative(-1.5f)
            close()
        }
    }.build()
}
