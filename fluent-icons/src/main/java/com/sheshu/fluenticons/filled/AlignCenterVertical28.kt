package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignCenterVertical28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignCenterVertical28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.25f, 26f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(23f)
            horizontalLineTo(10f)
            curveToRelative(-1.519f, 0f, -2.75f, -1.231f, -2.75f, -2.75f)
            verticalLineToRelative(-2.5f)
            curveTo(7.25f, 16.231f, 8.481f, 15f, 10f, 15f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(-2f)
            horizontalLineTo(7.25f)
            curveToRelative(-1.519f, 0f, -2.75f, -1.231f, -2.75f, -2.75f)
            verticalLineToRelative(-2.5f)
            curveTo(4.5f, 6.231f, 5.731f, 5f, 7.25f, 5f)
            horizontalLineToRelative(6.25f)
            verticalLineTo(2.75f)
            curveTo(13.5f, 2.336f, 13.836f, 2f, 14.25f, 2f)
            reflectiveCurveTo(15f, 2.336f, 15f, 2.75f)
            verticalLineTo(5f)
            horizontalLineToRelative(5.75f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(15f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(2.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            close()
        }
    }.build()
}
