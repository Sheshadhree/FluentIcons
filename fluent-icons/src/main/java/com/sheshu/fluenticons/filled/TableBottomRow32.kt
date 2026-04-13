package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableBottomRow32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableBottomRow32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 4f)
            curveTo(6.239f, 4f, 4f, 6.239f, 4f, 9f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(2f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(14f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(2f)
            verticalLineTo(9f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            horizontalLineTo(9f)
            close()
            moveToRelative(11f, 18f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-8f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(3f, 6f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            close()
            moveToRelative(-13f, -6f)
            verticalLineToRelative(6f)
            horizontalLineTo(9f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(6f)
            close()
        }
    }.build()
}
