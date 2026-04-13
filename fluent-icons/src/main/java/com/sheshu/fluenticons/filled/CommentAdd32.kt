package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentAdd32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentAdd32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 16.5f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            curveToRelative(0f, -4.142f, -3.358f, -7.5f, -7.5f, -7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, 3.358f, -7.5f, 7.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            close()
            moveToRelative(1f, -12.25f)
            verticalLineTo(8f)
            horizontalLineToRelative(3.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(28.164f, 9.5f, 27.75f, 9.5f)
            horizontalLineTo(24f)
            verticalLineToRelative(3.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(-3.75f)
            curveTo(18.336f, 9.5f, 18f, 9.164f, 18f, 8.75f)
            reflectiveCurveTo(18.336f, 8f, 18.75f, 8f)
            horizontalLineToRelative(3.75f)
            verticalLineTo(4.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(24f, 3.836f, 24f, 4.25f)
            close()
            moveTo(6.5f, 3f)
            horizontalLineToRelative(9.792f)
            curveTo(14.867f, 4.592f, 14f, 6.695f, 14f, 9f)
            curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
            curveToRelative(2.827f, 0f, 5.35f, -1.304f, 7f, -3.343f)
            verticalLineTo(19.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-7.631f)
            lineToRelative(-6.571f, 5.603f)
            curveTo(9.999f, 30.71f, 8f, 29.787f, 8f, 28.08f)
            verticalLineTo(24f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 24f, 2f, 21.985f, 2f, 19.5f)
            verticalLineToRelative(-12f)
            curveTo(2f, 5.015f, 4.015f, 3f, 6.5f, 3f)
            close()
        }
    }.build()
}
