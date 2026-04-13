package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HeartOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HeartOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(1.271f, 1.27f)
            curveToRelative(-0.053f, 0.049f, -0.105f, 0.098f, -0.156f, 0.15f)
            curveToRelative(-1.688f, 1.705f, -1.68f, 4.476f, 0.016f, 6.189f)
            lineToRelative(6.277f, 6.34f)
            curveToRelative(0.26f, 0.263f, 0.682f, 0.263f, 0.942f, 0f)
            lineToRelative(2.787f, -2.813f)
            lineToRelative(3.863f, 3.864f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveToRelative(13.888f, 8.352f)
            lineToRelative(-2.05f, 2.07f)
            lineToRelative(-9.438f, -9.437f)
            curveTo(6.684f, 2.769f, 8.266f, 3.156f, 9.388f, 4.29f)
            lineTo(9.993f, 4.9f)
            lineToRelative(0.596f, -0.603f)
            curveToRelative(1.692f, -1.709f, 4.436f, -1.7f, 6.135f, 0.016f)
            curveToRelative(1.696f, 1.713f, 1.701f, 4.476f, 0.017f, 6.186f)
            close()
        }
    }.build()
}
