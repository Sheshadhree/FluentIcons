package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Beaker24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Beaker24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 4.5f)
            verticalLineToRelative(6.238f)
            curveToRelative(0f, 0.375f, -0.094f, 0.744f, -0.273f, 1.074f)
            lineTo(7.54f, 14f)
            horizontalLineToRelative(8.921f)
            lineToRelative(-1.187f, -2.188f)
            curveTo(15.093f, 11.482f, 15f, 11.113f, 15f, 10.738f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(16.414f, 3f, 16f, 3f)
            horizontalLineTo(8f)
            curveTo(7.586f, 3f, 7.25f, 3.336f, 7.25f, 3.75f)
            reflectiveCurveTo(7.586f, 4.5f, 8f, 4.5f)
            horizontalLineToRelative(1f)
            close()
            moveToRelative(8.275f, 11f)
            horizontalLineTo(6.725f)
            lineToRelative(-1.582f, 2.915f)
            curveTo(4.51f, 19.581f, 5.353f, 21f, 6.68f, 21f)
            horizontalLineToRelative(10.638f)
            curveToRelative(1.327f, 0f, 2.171f, -1.419f, 1.538f, -2.585f)
            lineTo(17.275f, 15.5f)
            close()
        }
    }.build()
}
