package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LayoutColumnTwoSplitRight24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LayoutColumnTwoSplitRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(6.25f, 4.5f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-15f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(11.5f, 15f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-6.75f)
            verticalLineToRelative(6.75f)
            horizontalLineToRelative(5f)
            close()
            moveToRelative(1.75f, -8.25f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(6.75f)
            horizontalLineToRelative(6.75f)
            close()
        }
    }.build()
}
