package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EmojiSad24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EmojiSad24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 1.998f)
            curveToRelative(5.524f, 0f, 10.002f, 4.478f, 10.002f, 10.002f)
            curveToRelative(0f, 5.523f, -4.478f, 10f, -10.002f, 10f)
            curveToRelative(-5.524f, 0.001f, -10.002f, -4.477f, -10.002f, -10f)
            curveTo(1.998f, 6.476f, 6.476f, 1.998f, 12f, 1.998f)
            close()
            moveToRelative(0f, 11.5f)
            curveToRelative(-1.635f, 0f, -3.167f, 0.657f, -4.288f, 1.802f)
            curveToRelative(-0.29f, 0.296f, -0.285f, 0.77f, 0.011f, 1.06f)
            curveToRelative(0.296f, 0.29f, 0.77f, 0.285f, 1.06f, -0.01f)
            curveToRelative(0.842f, -0.86f, 1.99f, -1.353f, 3.217f, -1.353f)
            curveToRelative(1.225f, 0f, 2.37f, 0.49f, 3.211f, 1.347f)
            curveToRelative(0.29f, 0.295f, 0.765f, 0.3f, 1.06f, 0.01f)
            curveToRelative(0.296f, -0.291f, 0.3f, -0.766f, 0.01f, -1.061f)
            curveToRelative(-1.12f, -1.141f, -2.65f, -1.796f, -4.28f, -1.796f)
            close()
            moveTo(9f, 8.75f)
            curveToRelative(-0.69f, 0f, -1.249f, 0.56f, -1.249f, 1.25f)
            reflectiveCurveToRelative(0.56f, 1.249f, 1.25f, 1.249f)
            reflectiveCurveToRelative(1.249f, -0.56f, 1.249f, -1.25f)
            reflectiveCurveTo(9.69f, 8.75f, 9f, 8.75f)
            close()
            moveToRelative(6f, 0f)
            curveToRelative(-0.69f, 0f, -1.249f, 0.56f, -1.249f, 1.25f)
            reflectiveCurveToRelative(0.56f, 1.249f, 1.25f, 1.249f)
            reflectiveCurveToRelative(1.249f, -0.56f, 1.249f, -1.25f)
            reflectiveCurveTo(15.69f, 8.75f, 15f, 8.75f)
            close()
        }
    }.build()
}
