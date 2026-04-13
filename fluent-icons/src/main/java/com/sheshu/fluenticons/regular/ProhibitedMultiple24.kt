package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ProhibitedMultiple24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ProhibitedMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.697f, 5.697f)
            curveToRelative(2.75f, -2.75f, 7.104f, -2.918f, 10.05f, -0.504f)
            lineTo(5.193f, 15.747f)
            curveToRelative(-2.414f, -2.946f, -2.246f, -7.3f, 0.504f, -10.05f)
            close()
            moveToRelative(0.556f, 11.11f)
            lineTo(16.807f, 6.253f)
            curveToRelative(2.414f, 2.946f, 2.246f, 7.3f, -0.504f, 10.05f)
            curveToRelative(-2.75f, 2.75f, -7.104f, 2.918f, -10.05f, 0.504f)
            close()
            moveTo(17.364f, 4.636f)
            curveToRelative(-3.515f, -3.515f, -9.213f, -3.515f, -12.728f, 0f)
            curveToRelative(-3.515f, 3.515f, -3.515f, 9.213f, 0f, 12.728f)
            curveToRelative(3.515f, 3.515f, 9.213f, 3.515f, 12.728f, 0f)
            curveToRelative(3.515f, -3.515f, 3.515f, -9.213f, 0f, -12.728f)
            close()
            moveTo(21f, 11f)
            curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
            curveToRelative(-0.864f, 0f, -1.702f, -0.11f, -2.501f, -0.315f)
            curveToRelative(1.266f, 0.68f, 2.713f, 1.065f, 4.251f, 1.065f)
            curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
            curveToRelative(0f, -1.538f, -0.386f, -2.985f, -1.065f, -4.251f)
            curveTo(20.89f, 9.299f, 21f, 10.136f, 21f, 11f)
            close()
        }
    }.build()
}
