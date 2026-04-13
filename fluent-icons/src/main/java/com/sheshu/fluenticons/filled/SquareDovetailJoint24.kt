package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareDovetailJoint24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareDovetailJoint24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 14.25f)
            curveToRelative(0f, -0.241f, 0.116f, -0.468f, 0.312f, -0.608f)
            curveToRelative(0.196f, -0.14f, 0.449f, -0.178f, 0.676f, -0.104f)
            lineToRelative(3.513f, 1.171f)
            verticalLineTo(9.291f)
            lineToRelative(-3.513f, 1.171f)
            curveToRelative(-0.228f, 0.073f, -0.481f, 0.039f, -0.676f, -0.104f)
            curveTo(9.117f, 10.217f, 9f, 9.991f, 9f, 9.75f)
            verticalLineTo(3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(9f)
            verticalLineToRelative(-6.75f)
            close()
            moveTo(17.75f, 3f)
            horizontalLineTo(10.5f)
            verticalLineToRelative(5.709f)
            lineToRelative(3.513f, -1.171f)
            curveToRelative(0.226f, -0.075f, 0.48f, -0.039f, 0.676f, 0.104f)
            curveToRelative(0.195f, 0.141f, 0.312f, 0.367f, 0.312f, 0.608f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.241f, -0.116f, 0.468f, -0.312f, 0.608f)
            curveToRelative(-0.196f, 0.14f, -0.449f, 0.178f, -0.676f, 0.104f)
            lineTo(10.5f, 15.291f)
            verticalLineTo(21f)
            horizontalLineToRelative(7.25f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            close()
        }
    }.build()
}
