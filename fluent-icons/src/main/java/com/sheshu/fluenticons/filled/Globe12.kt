package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Globe12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Globe12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.99f, 6.5f)
            horizontalLineTo(4.011f)
            curveToRelative(0.06f, 1.325f, 0.353f, 2.477f, 0.762f, 3.295f)
            curveTo(5.264f, 10.775f, 5.755f, 11f, 6f, 11f)
            curveToRelative(0.245f, 0f, 0.737f, -0.225f, 1.227f, -1.205f)
            curveToRelative(0.41f, -0.818f, 0.703f, -1.97f, 0.762f, -3.295f)
            close()
            moveToRelative(-3.978f, -1f)
            curveToRelative(0.06f, -1.325f, 0.353f, -2.477f, 0.762f, -3.295f)
            curveTo(5.264f, 1.225f, 5.755f, 1f, 6f, 1f)
            reflectiveCurveToRelative(0.737f, 0.225f, 1.227f, 1.205f)
            curveTo(7.637f, 3.023f, 7.93f, 4.175f, 7.989f, 5.5f)
            horizontalLineTo(4.012f)
            close()
            moveToRelative(-1.001f, 0f)
            horizontalLineTo(1.025f)
            curveToRelative(0.186f, -1.866f, 1.397f, -3.43f, 3.062f, -4.12f)
            curveToRelative(-0.604f, 1f, -1.008f, 2.465f, -1.076f, 4.12f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineTo(1.025f)
            curveToRelative(0.186f, 1.866f, 1.397f, 3.43f, 3.062f, 4.12f)
            curveToRelative(-0.604f, -1f, -1.008f, -2.465f, -1.076f, -4.12f)
            close()
            moveToRelative(5.98f, 0f)
            horizontalLineToRelative(1.985f)
            curveToRelative(-0.185f, 1.866f, -1.396f, 3.43f, -3.061f, 4.12f)
            curveToRelative(0.603f, -1f, 1.007f, -2.465f, 1.075f, -4.12f)
            close()
            moveToRelative(1.985f, -1f)
            horizontalLineTo(8.99f)
            curveTo(8.922f, 3.845f, 8.518f, 2.38f, 7.915f, 1.38f)
            curveTo(9.58f, 2.07f, 10.79f, 3.633f, 10.976f, 5.5f)
            close()
        }
    }.build()
}
