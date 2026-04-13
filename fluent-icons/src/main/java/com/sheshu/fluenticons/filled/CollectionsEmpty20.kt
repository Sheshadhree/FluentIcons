package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CollectionsEmpty20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CollectionsEmpty20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 7f)
            curveToRelative(1.325f, 0f, 2.41f, 1.032f, 2.494f, 2.336f)
            lineTo(18f, 9.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.325f, -1.032f, 2.41f, -2.336f, 2.494f)
            lineTo(15.5f, 18f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.325f, 0f, -2.41f, -1.032f, -2.495f, -2.336f)
            lineTo(7f, 15.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.325f, 1.032f, -2.41f, 2.336f, -2.495f)
            lineTo(9.5f, 7f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(-2.838f, -3.305f)
            lineToRelative(0.048f, 0.158f)
            lineTo(13.285f, 6f)
            horizontalLineTo(9f)
            curveTo(7.402f, 6f, 6.096f, 7.249f, 6.005f, 8.824f)
            lineTo(6f, 9f)
            verticalLineToRelative(5.348f)
            curveToRelative(-1.027f, -0.021f, -1.964f, -0.679f, -2.31f, -1.683f)
            lineToRelative(-0.052f, -0.17f)
            lineToRelative(-1.553f, -5.796f)
            curveToRelative(-0.343f, -1.28f, 0.372f, -2.595f, 1.61f, -3.014f)
            lineToRelative(0.158f, -0.047f)
            lineToRelative(5.795f, -1.553f)
            curveToRelative(1.227f, -0.33f, 2.485f, 0.315f, 2.957f, 1.458f)
            lineToRelative(0.057f, 0.152f)
            close()
        }
    }.build()
}
