package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutRowFourFocusCenterTop20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutRowFourFocusCenterTop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 3f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(2f, 3f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(12f)
            verticalLineTo(6f)
            close()
            moveToRelative(0f, 4f)
            horizontalLineTo(4f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(12f)
            verticalLineTo(10f)
            close()
            moveTo(4f, 14f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-0.5f)
            horizontalLineTo(4f)
            verticalLineTo(14f)
            close()
        }
    }.build()
}
