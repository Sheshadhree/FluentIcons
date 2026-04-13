package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableSimpleInclude32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableSimpleInclude32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(7.286f)
            curveToRelative(-0.557f, -0.523f, -1.24f, -0.913f, -2f, -1.12f)
            verticalLineTo(7.5f)
            curveTo(27f, 6.12f, 25.88f, 5f, 24.5f, 5f)
            horizontalLineTo(17f)
            verticalLineToRelative(8.666f)
            curveToRelative(-0.76f, 0.207f, -1.443f, 0.597f, -2f, 1.12f)
            verticalLineTo(5f)
            horizontalLineTo(7.5f)
            curveTo(6.12f, 5f, 5f, 6.12f, 5f, 7.5f)
            verticalLineTo(15f)
            horizontalLineToRelative(9.786f)
            curveToRelative(-0.523f, 0.557f, -0.913f, 1.24f, -1.12f, 2f)
            horizontalLineTo(5f)
            verticalLineToRelative(7.5f)
            curveTo(5f, 25.88f, 6.12f, 27f, 7.5f, 27f)
            horizontalLineToRelative(6.166f)
            curveToRelative(0.207f, 0.76f, 0.597f, 1.443f, 1.12f, 2f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            close()
            moveToRelative(12f, 10.75f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-7.5f)
            curveTo(16.455f, 29f, 15f, 27.545f, 15f, 25.75f)
            verticalLineToRelative(-7.5f)
            close()
        }
    }.build()
}
