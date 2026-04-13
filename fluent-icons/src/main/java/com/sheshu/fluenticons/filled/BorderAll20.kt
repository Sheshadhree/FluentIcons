package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BorderAll20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BorderAll20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 4.5f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4.75f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(4.5f, 0f)
            verticalLineToRelative(4.75f)
            horizontalLineToRelative(4.75f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(4.75f, 6.25f)
            horizontalLineToRelative(-4.75f)
            verticalLineToRelative(4.75f)
            horizontalLineToRelative(3f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-3f)
            close()
            moveTo(9.25f, 15.5f)
            verticalLineToRelative(-4.75f)
            horizontalLineTo(4.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(3f)
            close()
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(7.5f)
            curveTo(15.545f, 3f, 17f, 4.455f, 17f, 6.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-7.5f)
            curveTo(4.455f, 17f, 3f, 15.545f, 3f, 13.75f)
            verticalLineToRelative(-7.5f)
            close()
        }
    }.build()
}
