package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PositionForward24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PositionForward24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.25f, 16.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-8f)
            curveTo(16.5f, 3.455f, 15.045f, 2f, 13.25f, 2f)
            horizontalLineToRelative(-8f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(-5.75f, 1f)
            horizontalLineTo(9f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(8f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-8f)
            curveTo(20.5f, 9.784f, 19.716f, 9f, 18.75f, 9f)
            horizontalLineTo(17.5f)
            verticalLineTo(7.5f)
            horizontalLineToRelative(1.25f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-8f)
            curveToRelative(-1.795f, 0f, -3.25f, -1.455f, -3.25f, -3.25f)
            verticalLineTo(17.5f)
            close()
        }
    }.build()
}
