package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoOff48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoOff48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(30.929f, 32.697f)
            lineToRelative(10.937f, 10.937f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-37.5f, -37.5f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(4.119f, 4.119f)
            curveTo(5.893f, 11.014f, 4f, 13.41f, 4f, 16.25f)
            verticalLineToRelative(15.5f)
            curveTo(4f, 35.202f, 6.798f, 38f, 10.25f, 38f)
            horizontalLineToRelative(14.5f)
            curveToRelative(3.13f, 0f, 5.723f, -2.3f, 6.179f, -5.303f)
            close()
            moveToRelative(13.075f, 0.046f)
            curveToRelative(0f, 1.973f, -1.667f, 3.335f, -3.411f, 3.252f)
            lineTo(33f, 28.403f)
            verticalLineTo(16.66f)
            lineToRelative(5.907f, -4.079f)
            curveToRelative(2.156f, -1.488f, 5.097f, 0.055f, 5.097f, 2.675f)
            verticalLineToRelative(17.487f)
            close()
            moveTo(31f, 16.25f)
            verticalLineToRelative(10.153f)
            lineTo(14.597f, 10f)
            horizontalLineTo(24.75f)
            curveToRelative(3.452f, 0f, 6.25f, 2.798f, 6.25f, 6.25f)
            close()
        }
    }.build()
}
