package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PlayCircle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PlayCircle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 44f)
            curveToRelative(11.046f, 0f, 20f, -8.954f, 20f, -20f)
            reflectiveCurveTo(35.046f, 4f, 24f, 4f)
            reflectiveCurveTo(4f, 12.954f, 4f, 24f)
            reflectiveCurveToRelative(8.954f, 20f, 20f, 20f)
            close()
            moveToRelative(9.766f, -21.287f)
            curveToRelative(0.974f, 0.582f, 0.974f, 1.993f, 0f, 2.575f)
            lineToRelative(-12.362f, 7.387f)
            curveToRelative(-1.5f, 0.897f, -3.404f, -0.184f, -3.404f, -1.93f)
            verticalLineTo(17.256f)
            curveToRelative(0f, -1.747f, 1.904f, -2.828f, 3.404f, -1.932f)
            lineToRelative(12.362f, 7.388f)
            close()
        }
    }.build()
}
