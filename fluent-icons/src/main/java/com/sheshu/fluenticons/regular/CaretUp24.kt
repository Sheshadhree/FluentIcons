package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretUp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretUp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.161f, 14.907f)
            curveToRelative(-0.707f, 0.809f, -0.133f, 2.073f, 0.941f, 2.073f)
            horizontalLineToRelative(11.796f)
            curveToRelative(1.074f, 0f, 1.648f, -1.264f, 0.941f, -2.073f)
            lineToRelative(-5.522f, -6.31f)
            curveToRelative(-0.697f, -0.797f, -1.937f, -0.797f, -2.634f, 0f)
            lineToRelative(-5.522f, 6.31f)
            close()
            moveToRelative(1.492f, 0.573f)
            lineToRelative(5.159f, -5.896f)
            curveToRelative(0.1f, -0.113f, 0.277f, -0.113f, 0.376f, 0f)
            lineToRelative(5.16f, 5.896f)
            horizontalLineTo(6.652f)
            close()
        }
    }.build()
}
