package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Send28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Send28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.043f, 4.076f)
            curveToRelative(-0.275f, -1.03f, 0.783f, -1.91f, 1.746f, -1.451f)
            lineToRelative(21.497f, 10.249f)
            curveToRelative(0.95f, 0.452f, 0.95f, 1.804f, 0f, 2.256f)
            lineTo(3.79f, 25.38f)
            curveToRelative(-0.963f, 0.458f, -2.021f, -0.422f, -1.746f, -1.452f)
            lineTo(4.7f, 14.002f)
            lineTo(2.044f, 4.076f)
            close()
            moveToRelative(4.008f, 10.676f)
            lineToRelative(-2.419f, 9.04f)
            lineToRelative(20.536f, -9.79f)
            lineToRelative(-20.535f, -9.79f)
            lineToRelative(2.418f, 9.04f)
            horizontalLineTo(17.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(6.05f)
            close()
        }
    }.build()
}
