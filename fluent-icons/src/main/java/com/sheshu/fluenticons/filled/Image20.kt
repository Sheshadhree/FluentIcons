package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Image20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Image20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.65f, 0.206f, 1.25f, 0.557f, 1.742f)
            lineToRelative(5.39f, -5.308f)
            curveToRelative(0.584f, -0.574f, 1.522f, -0.574f, 2.105f, 0f)
            lineToRelative(5.39f, 5.308f)
            curveTo(16.795f, 15.25f, 17f, 14.649f, 17f, 14f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(0f, 14f)
            curveToRelative(-0.646f, 0f, -1.245f, -0.204f, -1.735f, -0.552f)
            lineToRelative(5.384f, -5.3f)
            curveToRelative(0.195f, -0.192f, 0.507f, -0.192f, 0.702f, 0f)
            lineToRelative(5.384f, 5.3f)
            curveTo(15.245f, 16.796f, 14.646f, 17f, 14f, 17f)
            horizontalLineTo(6f)
            close()
            moveToRelative(6.5f, -8.25f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            close()
        }
    }.build()
}
