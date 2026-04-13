package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableBottomRow48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableBottomRow48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(42f, 12.25f)
            curveTo(42f, 8.798f, 39.202f, 6f, 35.75f, 6f)
            horizontalLineToRelative(-23.5f)
            curveTo(8.798f, 6f, 6f, 8.798f, 6f, 12.25f)
            verticalLineToRelative(23.5f)
            curveTo(6f, 39.202f, 8.798f, 42f, 12.25f, 42f)
            horizontalLineToRelative(23.5f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineToRelative(-23.5f)
            close()
            moveTo(8.5f, 28.5f)
            verticalLineTo(12.25f)
            curveToRelative(0f, -2.071f, 1.679f, -3.75f, 3.75f, -3.75f)
            horizontalLineToRelative(23.5f)
            curveToRelative(2.071f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            verticalLineTo(28.5f)
            horizontalLineToRelative(-31f)
            close()
            moveToRelative(0f, 7.25f)
            verticalLineTo(31f)
            horizontalLineTo(17f)
            verticalLineToRelative(8.5f)
            horizontalLineToRelative(-4.75f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            close()
            moveToRelative(20f, 3.75f)
            horizontalLineToRelative(-9f)
            verticalLineTo(31f)
            horizontalLineToRelative(9f)
            verticalLineToRelative(8.5f)
            close()
            moveToRelative(7.25f, 0f)
            horizontalLineTo(31f)
            verticalLineTo(31f)
            horizontalLineToRelative(8.5f)
            verticalLineToRelative(4.75f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            close()
        }
    }.build()
}
