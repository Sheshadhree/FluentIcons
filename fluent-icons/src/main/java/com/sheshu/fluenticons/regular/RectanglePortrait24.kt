package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RectanglePortrait24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RectanglePortrait24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.25f, 22f)
            curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(4f, 3.455f, 5.455f, 2f, 7.25f, 2f)
            horizontalLineToRelative(9.5f)
            curveTo(18.545f, 2f, 20f, 3.455f, 20f, 5.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-9.5f)
            close()
            moveTo(5.5f, 18.75f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(5.25f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-9.5f)
            curveTo(6.284f, 3.5f, 5.5f, 4.284f, 5.5f, 5.25f)
            verticalLineToRelative(13.5f)
            close()
        }
    }.build()
}
