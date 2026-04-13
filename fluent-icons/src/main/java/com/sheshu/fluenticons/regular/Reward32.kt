package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Reward32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Reward32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 6.25f)
            curveTo(5f, 5.56f, 5.56f, 5f, 6.25f, 5f)
            horizontalLineTo(9f)
            verticalLineToRelative(7.071f)
            lineToRelative(-2.822f, -1.528f)
            curveTo(5.452f, 10.149f, 5f, 9.39f, 5f, 8.564f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(6f, 6.904f)
            verticalLineTo(5f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(8.154f)
            lineToRelative(-4.88f, 2.644f)
            curveToRelative(-0.075f, 0.04f, -0.165f, 0.04f, -0.24f, 0f)
            lineTo(11f, 13.154f)
            close()
            moveToRelative(12f, -1.083f)
            verticalLineTo(5f)
            horizontalLineToRelative(2.75f)
            curveTo(26.44f, 5f, 27f, 5.56f, 27f, 6.25f)
            verticalLineToRelative(2.314f)
            curveToRelative(0f, 0.826f, -0.452f, 1.585f, -1.178f, 1.979f)
            lineTo(23f, 12.07f)
            close()
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(2.314f)
            curveToRelative(0f, 1.56f, 0.854f, 2.994f, 2.226f, 3.737f)
            lineToRelative(7.985f, 4.326f)
            curveTo(11.017f, 17.67f, 9.5f, 19.908f, 9.5f, 22.5f)
            curveToRelative(0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
            reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
            curveToRelative(0f, -2.592f, -1.517f, -4.83f, -3.712f, -5.873f)
            lineToRelative(7.986f, -4.326f)
            curveTo(28.146f, 11.558f, 29f, 10.124f, 29f, 8.564f)
            verticalLineTo(6.25f)
            curveTo(29f, 4.455f, 27.545f, 3f, 25.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveToRelative(5.25f, 19.5f)
            curveToRelative(0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveTo(18.485f, 27f, 16f, 27f)
            reflectiveCurveToRelative(-4.5f, -2.015f, -4.5f, -4.5f)
            close()
        }
    }.build()
}
