package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SplitHorizontal28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SplitHorizontal28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 12.998f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(22.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(2.75f)
            close()
            moveTo(24f, 4.75f)
            curveTo(24f, 3.23f, 22.769f, 2f, 21.25f, 2f)
            horizontalLineTo(6.75f)
            curveTo(5.23f, 2f, 4f, 3.232f, 4f, 4.75f)
            verticalLineToRelative(7.248f)
            horizontalLineToRelative(1.5f)
            verticalLineTo(4.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.559f, 1.25f, 1.25f)
            verticalLineToRelative(7.247f)
            horizontalLineTo(24f)
            verticalLineTo(4.75f)
            close()
            moveToRelative(-18.5f, 18f)
            verticalLineToRelative(-7.252f)
            horizontalLineTo(4f)
            verticalLineToRelative(7.252f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineToRelative(-7.252f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(7.252f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(6.75f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            close()
        }
    }.build()
}
