package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareDovetailJoint48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareDovetailJoint48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 28.568f)
            curveToRelative(0f, -0.399f, 0.19f, -0.774f, 0.514f, -1.01f)
            curveToRelative(0.321f, -0.235f, 0.738f, -0.303f, 1.118f, -0.181f)
            lineToRelative(7.868f, 2.522f)
            verticalLineTo(18.098f)
            lineToRelative(-7.868f, 2.522f)
            curveToRelative(-0.38f, 0.121f, -0.797f, 0.055f, -1.118f, -0.181f)
            curveToRelative(-0.323f, -0.235f, -0.514f, -0.61f, -0.514f, -1.01f)
            verticalLineTo(6f)
            horizontalLineToRelative(-5.75f)
            curveTo(8.798f, 6f, 6f, 8.798f, 6f, 12.25f)
            verticalLineToRelative(23.5f)
            curveTo(6f, 39.202f, 8.798f, 42f, 12.25f, 42f)
            horizontalLineTo(18f)
            verticalLineTo(28.568f)
            close()
            moveTo(35.75f, 6f)
            horizontalLineTo(20.5f)
            verticalLineToRelative(11.719f)
            lineToRelative(7.868f, -2.522f)
            curveToRelative(0.381f, -0.122f, 0.797f, -0.055f, 1.118f, 0.181f)
            curveToRelative(0.323f, 0.235f, 0.514f, 0.61f, 0.514f, 1.01f)
            verticalLineToRelative(15.227f)
            curveToRelative(0f, 0.399f, -0.19f, 0.774f, -0.514f, 1.01f)
            curveToRelative(-0.321f, 0.235f, -0.737f, 0.302f, -1.118f, 0.181f)
            lineTo(20.5f, 30.284f)
            verticalLineToRelative(11.719f)
            horizontalLineToRelative(15.25f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineTo(12.25f)
            curveTo(42f, 8.798f, 39.202f, 6f, 35.75f, 6f)
            close()
        }
    }.build()
}
