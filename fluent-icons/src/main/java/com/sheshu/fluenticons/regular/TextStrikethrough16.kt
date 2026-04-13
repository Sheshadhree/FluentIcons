package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextStrikethrough16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextStrikethrough16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 5.1f)
            curveToRelative(0f, -0.554f, 0.292f, -1.065f, 0.84f, -1.455f)
            curveTo(6.392f, 3.252f, 7.187f, 3f, 8.1f, 3f)
            curveToRelative(1.298f, 0f, 2.384f, 0.56f, 2.763f, 1.243f)
            curveToRelative(0.134f, 0.241f, 0.438f, 0.328f, 0.68f, 0.194f)
            curveToRelative(0.241f, -0.134f, 0.328f, -0.438f, 0.194f, -0.68f)
            curveTo(11.117f, 2.64f, 9.602f, 2f, 8.1f, 2f)
            curveTo(7.013f, 2f, 6.008f, 2.298f, 5.26f, 2.83f)
            curveTo(4.508f, 3.365f, 4f, 4.154f, 4f, 5.1f)
            curveTo(4f, 5.82f, 4.3f, 6.475f, 4.79f, 7f)
            horizontalLineToRelative(1.722f)
            curveTo(5.552f, 6.593f, 5f, 5.83f, 5f, 5.1f)
            close()
            moveTo(13.5f, 8f)
            curveTo(13.776f, 8f, 14f, 8.224f, 14f, 8.5f)
            reflectiveCurveTo(13.776f, 9f, 13.5f, 9f)
            horizontalLineToRelative(-2.342f)
            curveTo(11.675f, 9.504f, 12f, 10.149f, 12f, 10.9f)
            curveToRelative(0f, 0.902f, -0.515f, 1.688f, -1.255f, 2.229f)
            curveTo(10.002f, 13.672f, 8.996f, 14f, 7.9f, 14f)
            curveToRelative(-1.624f, 0f, -3.002f, -0.65f, -3.716f, -1.723f)
            curveToRelative(-0.153f, -0.23f, -0.091f, -0.54f, 0.139f, -0.693f)
            curveToRelative(0.23f, -0.153f, 0.54f, -0.091f, 0.693f, 0.139f)
            curveTo(5.502f, 12.45f, 6.524f, 13f, 7.9f, 13f)
            curveToRelative(0.904f, 0f, 1.698f, -0.272f, 2.255f, -0.679f)
            curveTo(10.715f, 11.912f, 11f, 11.398f, 11f, 10.9f)
            curveToRelative(0f, -0.775f, -0.63f, -1.526f, -1.777f, -1.9f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 9f, 2f, 8.776f, 2f, 8.5f)
            reflectiveCurveTo(2.224f, 8f, 2.5f, 8f)
            horizontalLineToRelative(11f)
            close()
        }
    }.build()
}
