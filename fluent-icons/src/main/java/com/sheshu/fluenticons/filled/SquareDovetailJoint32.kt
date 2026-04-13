package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareDovetailJoint32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareDovetailJoint32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 19.272f)
            curveToRelative(0f, -0.312f, 0.146f, -0.605f, 0.393f, -0.795f)
            curveToRelative(0.249f, -0.189f, 0.572f, -0.251f, 0.87f, -0.17f)
            lineTo(19f, 20.144f)
            verticalLineToRelative(-8.289f)
            lineToRelative(-6.737f, 1.837f)
            curveToRelative(-0.298f, 0.083f, -0.621f, 0.02f, -0.87f, -0.17f)
            curveTo(11.146f, 13.333f, 11f, 13.039f, 11f, 12.727f)
            verticalLineTo(3f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineToRelative(17f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineTo(11f)
            verticalLineToRelative(-9.728f)
            close()
            moveTo(24.5f, 3f)
            horizontalLineTo(13f)
            verticalLineToRelative(8.418f)
            lineToRelative(6.737f, -1.837f)
            curveToRelative(0.299f, -0.08f, 0.622f, -0.019f, 0.87f, 0.17f)
            curveTo(20.854f, 9.94f, 21f, 10.234f, 21f, 10.546f)
            verticalLineToRelative(10.908f)
            curveToRelative(0f, 0.312f, -0.146f, 0.605f, -0.393f, 0.795f)
            curveToRelative(-0.248f, 0.189f, -0.571f, 0.252f, -0.87f, 0.17f)
            lineTo(13f, 20.582f)
            verticalLineTo(29f)
            horizontalLineToRelative(11.5f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-17f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            close()
        }
    }.build()
}
