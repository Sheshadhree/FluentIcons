package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PresenceAvailable10: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PresenceAvailable10",
        defaultWidth = 10.dp,
        defaultHeight = 10.dp,
        viewportWidth = 10f,
        viewportHeight = 10f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 10f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveTo(7.761f, 0f, 5f, 0f)
            reflectiveCurveTo(0f, 2.239f, 0f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            close()
            moveToRelative(2.104f, -5.896f)
            lineToRelative(-2.25f, 2.25f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1f, -1f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(4.5f, 5.293f)
            lineToRelative(1.896f, -1.897f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            close()
        }
    }.build()
}
