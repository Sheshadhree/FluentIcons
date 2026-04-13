package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pause16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pause16",
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
            moveTo(3f, 3.75f)
            curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
            horizontalLineToRelative(1.5f)
            curveTo(5.664f, 3f, 6f, 3.336f, 6f, 3.75f)
            verticalLineToRelative(8.5f)
            curveTo(6f, 12.664f, 5.664f, 13f, 5.25f, 13f)
            horizontalLineToRelative(-1.5f)
            curveTo(3.336f, 13f, 3f, 12.664f, 3f, 12.25f)
            verticalLineToRelative(-8.5f)
            close()
            moveTo(10.75f, 2f)
            curveTo(9.784f, 2f, 9f, 2.784f, 9f, 3.75f)
            verticalLineToRelative(8.5f)
            curveTo(9f, 13.216f, 9.784f, 14f, 10.75f, 14f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-8.5f)
            curveTo(14f, 2.784f, 13.216f, 2f, 12.25f, 2f)
            horizontalLineToRelative(-1.5f)
            close()
            moveTo(10f, 3.75f)
            curveTo(10f, 3.336f, 10.336f, 3f, 10.75f, 3f)
            horizontalLineToRelative(1.5f)
            curveTo(12.664f, 3f, 13f, 3.336f, 13f, 3.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-1.5f)
            curveTo(10.336f, 13f, 10f, 12.664f, 10f, 12.25f)
            verticalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
