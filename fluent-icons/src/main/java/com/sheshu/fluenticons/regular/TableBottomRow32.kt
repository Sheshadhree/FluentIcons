package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableBottomRow32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableBottomRow32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 4f)
            curveTo(6.239f, 4f, 4f, 6.239f, 4f, 9f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            horizontalLineToRelative(14f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            verticalLineTo(9f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            horizontalLineTo(9f)
            close()
            moveTo(6f, 9f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(14f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(10f)
            horizontalLineTo(6f)
            verticalLineTo(9f)
            close()
            moveToRelative(0f, 14f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(5f)
            horizontalLineTo(9f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            close()
            moveToRelative(7f, 3f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(8f, 0f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}
