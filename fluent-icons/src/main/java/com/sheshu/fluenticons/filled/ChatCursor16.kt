package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChatCursor16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatCursor16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            curveToRelative(0f, 0.362f, -0.039f, 0.716f, -0.112f, 1.057f)
            lineTo(9.861f, 5.398f)
            curveTo(8.72f, 4.463f, 7.003f, 5.276f, 7.003f, 6.752f)
            lineTo(7.002f, 11f)
            horizontalLineTo(7f)
            curveToRelative(-0.873f, 0f, -1.694f, -0.224f, -2.41f, -0.618f)
            lineToRelative(-1.944f, 0.592f)
            curveToRelative(-0.177f, 0.054f, -0.369f, 0.006f, -0.5f, -0.125f)
            curveToRelative(-0.13f, -0.13f, -0.178f, -0.322f, -0.124f, -0.499f)
            lineToRelative(0.592f, -1.947f)
            curveTo(2.223f, 7.689f, 2f, 6.87f, 2f, 6f)
            close()
            moveToRelative(7.228f, 0.172f)
            lineToRelative(5.496f, 4.497f)
            curveTo(15.27f, 11.116f, 14.954f, 12f, 14.25f, 12f)
            horizontalLineToRelative(-2.986f)
            curveToRelative(-0.157f, 0f, -0.304f, 0.074f, -0.399f, 0.2f)
            lineTo(9.35f, 14.204f)
            curveToRelative(-0.433f, 0.574f, -1.348f, 0.267f, -1.348f, -0.452f)
            lineToRelative(0.002f, -7f)
            curveToRelative(0f, -0.04f, 0.003f, -0.078f, 0.008f, -0.115f)
            curveToRelative(0.083f, -0.558f, 0.758f, -0.84f, 1.217f, -0.465f)
            close()
        }
    }.build()
}
