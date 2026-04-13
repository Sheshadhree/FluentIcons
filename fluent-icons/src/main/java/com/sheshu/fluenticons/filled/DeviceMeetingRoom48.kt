package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DeviceMeetingRoom48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeviceMeetingRoom48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.97f, 10.403f)
            curveTo(9.666f, 7.806f, 12.019f, 6f, 14.708f, 6f)
            horizontalLineToRelative(18.586f)
            curveToRelative(2.689f, 0f, 5.041f, 1.806f, 5.736f, 4.403f)
            lineToRelative(4.756f, 17.769f)
            curveToRelative(1.057f, 3.95f, -1.92f, 7.828f, -6.009f, 7.828f)
            horizontalLineTo(10.224f)
            curveToRelative(-4.09f, 0f, -7.066f, -3.878f, -6.01f, -7.828f)
            lineToRelative(4.757f, -17.77f)
            close()
            moveTo(13.25f, 38f)
            curveTo(12.56f, 38f, 12f, 38.56f, 12f, 39.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(21.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(35.44f, 38f, 34.75f, 38f)
            horizontalLineToRelative(-21.5f)
            close()
        }
    }.build()
}
