package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SquareDovetailJoint32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SquareDovetailJoint32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24.5f, 3f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineToRelative(17f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineToRelative(17f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-17f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            close()
            moveTo(5f, 24.5f)
            verticalLineToRelative(-17f)
            curveTo(5f, 6.119f, 6.119f, 5f, 7.5f, 5f)
            horizontalLineTo(11f)
            verticalLineToRelative(7.727f)
            curveToRelative(0f, 0.312f, 0.146f, 0.605f, 0.393f, 0.795f)
            curveToRelative(0.249f, 0.188f, 0.572f, 0.252f, 0.87f, 0.17f)
            lineTo(19f, 11.855f)
            verticalLineToRelative(8.291f)
            lineToRelative(-6.737f, -1.837f)
            curveToRelative(-0.298f, -0.081f, -0.621f, -0.019f, -0.87f, 0.17f)
            curveTo(11.146f, 18.668f, 11f, 18.962f, 11f, 19.274f)
            verticalLineToRelative(7.727f)
            horizontalLineTo(7.5f)
            curveToRelative(-1.381f, 0f, -2.5f, -1.12f, -2.5f, -2.501f)
            close()
            moveToRelative(22f, 0f)
            curveToRelative(0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(13f)
            verticalLineToRelative(-6.418f)
            lineToRelative(6.737f, 1.837f)
            curveToRelative(0.299f, 0.082f, 0.622f, 0.019f, 0.87f, -0.17f)
            curveTo(20.854f, 22.06f, 21f, 21.766f, 21f, 21.454f)
            verticalLineTo(10.545f)
            curveToRelative(0f, -0.312f, -0.146f, -0.605f, -0.393f, -0.795f)
            curveToRelative(-0.248f, -0.188f, -0.571f, -0.251f, -0.87f, -0.17f)
            lineTo(13f, 11.417f)
            verticalLineTo(4.999f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.381f, 0f, 2.5f, 1.119f, 2.5f, 2.5f)
            verticalLineTo(24.5f)
            close()
        }
    }.build()
}
