package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableSimple48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableSimple48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.25f, 6f)
            horizontalLineToRelative(25.5f)
            curveTo(39.65f, 6f, 42f, 8.35f, 42f, 11.25f)
            verticalLineToRelative(25.5f)
            curveToRelative(0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
            horizontalLineToRelative(-25.5f)
            curveTo(8.35f, 42f, 6f, 39.65f, 6f, 36.75f)
            verticalLineToRelative(-25.5f)
            curveTo(6f, 8.35f, 8.35f, 6f, 11.25f, 6f)
            close()
            moveTo(23f, 8.5f)
            horizontalLineTo(11.25f)
            curveToRelative(-1.519f, 0f, -2.75f, 1.231f, -2.75f, 2.75f)
            verticalLineToRelative(11.5f)
            horizontalLineTo(23f)
            verticalLineTo(8.5f)
            close()
            moveTo(8.5f, 25.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineTo(23f)
            verticalLineTo(25.25f)
            horizontalLineTo(8.5f)
            close()
            moveToRelative(17f, 14.25f)
            horizontalLineToRelative(11.25f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineToRelative(-11.5f)
            horizontalLineToRelative(-14f)
            verticalLineTo(39.5f)
            close()
            moveToRelative(14f, -16.75f)
            verticalLineToRelative(-11.5f)
            curveToRelative(0f, -1.519f, -1.231f, -2.75f, -2.75f, -2.75f)
            horizontalLineTo(25.5f)
            verticalLineToRelative(14.25f)
            horizontalLineToRelative(14f)
            close()
        }
    }.build()
}
