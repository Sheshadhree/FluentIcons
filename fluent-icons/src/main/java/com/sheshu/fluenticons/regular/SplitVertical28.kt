package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SplitVertical28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SplitVertical28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.998f, 25.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(2.75f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(22.5f)
            close()
            moveTo(4.75f, 4f)
            curveTo(3.23f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineToRelative(14.5f)
            curveTo(2f, 22.77f, 3.232f, 24f, 4.75f, 24f)
            horizontalLineToRelative(7.248f)
            verticalLineToRelative(-1.5f)
            horizontalLineTo(4.75f)
            curveToRelative(-0.691f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(6.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(7.247f)
            verticalLineTo(4f)
            horizontalLineTo(4.75f)
            close()
            moveToRelative(18f, 18.5f)
            horizontalLineToRelative(-7.252f)
            verticalLineTo(24f)
            horizontalLineToRelative(7.252f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(6.75f)
            curveTo(25.5f, 5.231f, 24.269f, 4f, 22.75f, 4f)
            horizontalLineToRelative(-7.252f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(7.252f)
            curveTo(23.44f, 5.5f, 24f, 6.06f, 24f, 6.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            close()
        }
    }.build()
}
